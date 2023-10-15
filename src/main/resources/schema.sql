CREATE MEMORY TABLE "PUBLIC"."BLE_DETAILS"(
    "X_COORDINATE" FLOAT(53),
    "Y_COORDINATE" FLOAT(53),
    "BUILDING_ID" BIGINT,
    "ID" BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
    "MAC_ADDRESS" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."BLE_DETAILS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_F" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.BLE_DETAILS;
CREATE MEMORY TABLE "PUBLIC"."LABEL_DETAILS"(
    "BUILDING_ID" BIGINT,
    "FLOOR" BIGINT,
    "ID" BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
    "X_COORDINATE" BIGINT,
    "Y_COORDINATE" BIGINT,
    "ICON_NAME" CHARACTER VARYING(255),
    "LABEL_NAME" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."LABEL_DETAILS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_1" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.LABEL_DETAILS;
CREATE MEMORY TABLE "PUBLIC"."MAP_DETAILS"(
    "ID" BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
    "AXIS_COUNT" BIGINT,
    "BUILDING_ID" BIGINT NOT NULL,
    "MAP" INTEGER ARRAY
);
ALTER TABLE "PUBLIC"."MAP_DETAILS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_2" PRIMARY KEY("ID");