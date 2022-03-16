create table Property(
ProName  char(6)	not null unique,
StuNo    char(10) 	null,
RNo  char(10)			not null unique,
DorNo     smallint  	not null,
primary key(ProName),
foreign key(RNo) references Room(RNo),
foreign key(DorNo) references
Dormitory(DorNo));