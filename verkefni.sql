DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Hotels;
DROP TABLE IF EXISTS Rooms;
DROP TABLE IF EXISTS Bookings;

CREATE TABLE Users (
        userName VARCHAR(40) NOT NULL,
        email VARCHAR(60) NOT NULL,
        password VARCHAR(40) NOT NULL
);

CREATE TABLE Bookings (
        room Rooms,
        userName TEXT,
        begin DATE,
        end DATE,
        price INTEGER
);

CREATE TABLE Hotels (
       hotelName TEXT,
       hotelAddress TEXT,
       rating INTEGER
);

CREATE TABLE Rooms(
        beds INTEGER,
        available BOOLEAN,
        price INTEGER,
);

insert into Users VALUES
INSERT INTO users (username, email, password) VALUES
    ('john_smith', 'john.smith@example.com', 'P@ssw0rd1'),
    ('mary_johnson', 'mary.johnson@example.com', 'L0v3ly2'),
    ('david_wilson', 'david.wilson@example.com', 'SunnyD@y3'),
    ('jennifer_brown', 'jennifer.brown@example.com', 'R@inb0w4'),
    ('michael_jones', 'michael.jones@example.com', 'Wint3rBlu3'),
    ('linda_garcia', 'linda.garcia@example.com', 'Summ3rF@ir4'),
    ('robert_martinez', 'robert.martinez@example.com', 'AutumnL0v3r5'),
    ('patricia_robinson', 'patricia.robinson@example.com', 'F@llLeav3s6'),
    ('william_clark', 'william.clark@example.com', 'C@ndyC@n37'),
    ('elizabeth_rodriguez', 'elizabeth.rodriguez@example.com', 'F@iryt@l38'),
    ('richard_lewis', 'richard.lewis@example.com', 'M@gicSp@rk9'),
    ('jessica_hall', 'jessica.hall@example.com', 'Starlight1'),
    ('charles_young', 'charles.young@example.com', 'M00nB3@ms2'),
    ('susan_wright', 'susan.wright@example.com', 'B@byDr3ams3'),
    ('thomas_scott', 'thomas.scott@example.com', 'Butt3rfly4'),
    ('angelina_green', 'angelina.green@example.com', 'S@ndCastl35'),
    ('daniel_adams', 'daniel.adams@example.com', 'Tr3@sur3Hunt36'),
    ('margaret_baker', 'margaret.baker@example.com', 'D@nc3InTh3R@in7'),
    ('christopher_carter', 'christopher.carter@example.com', 'W@nd3rL@nd8'),
    ('sandra_hill', 'sandra.hill@example.com', 'Myst3ry9');

