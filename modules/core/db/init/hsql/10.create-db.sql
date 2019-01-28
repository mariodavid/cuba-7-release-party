-- begin C7RP_PARTY
create table C7RP_PARTY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    STARTS_AT timestamp,
    THEME varchar(50),
    LOCATION_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end C7RP_PARTY
-- begin C7RP_LOCATION
create table C7RP_LOCATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    STREET varchar(255),
    POSTCODE varchar(255),
    CITY varchar(255),
    SIZE_ varchar(50) not null,
    --
    primary key (ID)
)^
-- end C7RP_LOCATION
-- begin C7RP_PERSON
create table C7RP_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FIRST_NAME varchar(255),
    --
    primary key (ID)
)^
-- end C7RP_PERSON
-- begin C7RP_INVITATION
create table C7RP_INVITATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERSON_ID varchar(36) not null,
    PARTY_ID varchar(36) not null,
    INVITED_AT date not null,
    STATUS varchar(50) not null,
    --
    primary key (ID)
)^
-- end C7RP_INVITATION
