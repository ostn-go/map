package com.ostn.map.controller;

import com.ostn.map.entity.BleDetails;
import com.ostn.map.entity.MapDetails;
import com.ostn.map.services.BleDetailsService;
import com.ostn.map.services.MapDetailsService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ostn")
public class MapController {
    @Autowired
    private MapDetailsService mapDetailsService;

    @PostMapping("/map")
    public java.util.List<MapDetails> addNewMap(@RequestBody List<MapDetails> mapDetails) {
        System.out.println(mapDetailsService.addNewMap(mapDetails));
        return mapDetailsService.addNewMap(mapDetails);
    }

    @GetMapping(value = "/map/{buildingId}/{floorId}")
    public MapDetails generateFloorMapImage(@PathVariable Long buildingId,@PathVariable Long floorId) throws IOException {
        return mapDetailsService.getMapByFloorIdAndBuildingId(buildingId,floorId);
    }

    @GetMapping(value = "/building/{buildingId}/")
    public List<MapDetails> getMapsByBuldingId(@PathVariable Long buildingId) throws IOException {
        return mapDetailsService.getMapByBuildingId(buildingId);
    }


    @GetMapping(value = "/image/{buildingId}/{floorId}", produces = MediaType.IMAGE_PNG_VALUE)
    public void generateFloorMapImage(@PathVariable Long buildingId,@PathVariable Long floorId, HttpServletResponse response) throws IOException {

        System.out.println(buildingId);
        System.out.println(floorId);
        MapDetails mapDetails = mapDetailsService.getMapByFloorIdAndBuildingId(buildingId,floorId);
        System.out.println(mapDetails);
        int width = Math.toIntExact(mapDetails.getAxisCount()); // Set the image width
        // Create a BufferedImage
        BufferedImage image = new BufferedImage(width*10, width*10, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        // Sample array of colors (you can replace this with your data)
        Color[] colors = {new Color(0x78909C), new Color(0xB0BEC5), new Color(0x455A64)};
        // 0 -> background black Color(0x78909C);
        // 1 -> wall black new Color(0xB0BEC5)
        // 2 -> path black new Color(0x455A64)
        // Draw colored segments on the image
        for (int row = 0; row < width*10; row++) {
            for (int col = 0; col < width*10; col++) {

                int row1 = row/10;
                int col1 = col/10;
                int c1 = mapDetails.getMap().get((row1 * width + col1));
                g2d.setColor(colors[c1]);
                g2d.fillRect(col, row, 10, 10);
                // Fill a single pixel with the color
            }
        }

        // Dispose of the graphics context
        g2d.dispose();

        // Set response content type to PNG
        response.setContentType(MediaType.IMAGE_PNG_VALUE);

        // Set the content disposition header to make the image downloadable
        response.setHeader("Content-Disposition", "attachment; filename=image.png");

        // Write the image to the response output stream
        ImageIO.write(image, "png", response.getOutputStream());
    }

}
