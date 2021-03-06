CREATE TABLE WORKFLOW
(
  WORKFLOW_ID          INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME                 VARCHAR UNIQUE,
  INSTANCE_TABLE       VARCHAR,
  INSTANCE_STATE_FIELD VARCHAR,
  INSTANCE_KEY_FIELD   VARCHAR
);

CREATE TABLE WORKFLOW_STATE
(
  WORKFLOW_STATE_ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  WORKFLOW_ID       INTEGER REFERENCES WORKFLOW (WORKFLOW_ID),
  NAME              VARCHAR
);

CREATE TABLE WORKFLOW_TRANSITION
(
  WORKFLOW_TRANSITION_ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  WORKFLOW_ID            INTEGER REFERENCES WORKFLOW (WORKFLOW_ID),
  NAME                   VARCHAR,
  FROM_WORKFLOW_STATE_ID INTEGER REFERENCES WORKFLOW_STATE (WORKFLOW_STATE_ID),
  TO_WORKFLOW_STATE_ID   INTEGER REFERENCES WORKFLOW_STATE (WORKFLOW_STATE_ID)
);

CREATE TABLE WORKFLOW_TRANSITION_EVENT
(
  WORKFLOW_TRANSITION_EVENT_ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
  WORKFLOW_TRANSITION_ID       INTEGER REFERENCES WORKFLOW_TRANSITION (WORKFLOW_TRANSITION_ID),
  INSTANCE_KEY                 VARCHAR,
  TRANSITIONED_AT              TIMESTAMP,
  DATA                         VARCHAR
);
