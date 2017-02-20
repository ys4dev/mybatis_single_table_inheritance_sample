
create table parent(
  id int not null AUTO_INCREMENT,
  name text,
  age INT,
  PRIMARY KEY(id)
);

drop table IF EXISTS child;
create table child(
  id int not NULL AUTO_INCREMENT,
  parent_id int NOT NULL REFERENCES parent(id),
  type VARCHAR(20) not null,
  name text,
  PRIMARY KEY (id)
);
