-- Dodawanie adresów
INSERT INTO ADDRESS (id, address_line1, address_line2, city, postal_code)
VALUES
    (1, 'ul. Główna 5', '5', 'Wrocław', '12-345'),
    (2, 'ul. Szkolna 3', '6', 'Warszawa', '54-321'),
    (3, 'ul. Polna 12', '3', 'Gdańsk', '11-111'),
    (4, 'ul. Sportowa 11', '12', 'Kraków', '12-345'),
    (5, 'ul. Prosta 2', '26', 'Poznań', '11-111'),
    (6, 'ul. Główna 5', '52', 'Warszawa', '54-321'),
    (7, 'ul. Polna 10', '120', 'Wrocław', '22-222'),
    (8, 'ul. Sportowa 22', NULL, 'Gdańsk', '12-345'),
    (9, 'ul. Szkolna 33', NULL, 'Wrocław', '22-222'),
    (10, 'ul. Prosta 12', NULL, 'Kraków', '11-111'),
    (11, 'ul. Prosta 2', NULL, 'Warszawa', '12-345'),
    (12, 'ul. Polna 6', NULL, 'Gdańsk', '11-111'),
    (13, 'ul. Szkolna 10', NULL, 'Wrocław', '22-222'),
    (14, 'ul. Główna 5', NULL, 'Kraków', '12-345'),
    (15, 'ul. Polna 12', NULL, 'Poznań', '54-321');

-- Dodawanie lekarzy
INSERT INTO DOCTOR (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES
    (1, 'Kamil', 'Nowak', '111 111 111', '1@gmail.com', 'LEK-01', 'Internista'),
    (2, 'Konrad', 'Kowalski', '222 222 222', '2@gmail.com', 'LEK-02', 'Okulista'),
    (3, 'Joanna', 'Wiśniewski', '333 333 333', '3@gmail.com', 'LEK-03', 'Neurolog'),
    (4, 'Maciej', 'Nowakowski', '444 444 444', '4@gmail.com', 'LEK-04', 'Ortopeda'),
    (5, 'Małgorzata', 'Kowalski', '555 555 555', '5@gmail.com', 'LEK-05', 'Okulista'),
    (6, 'Jan', 'Nowak', '666 666 666', '6@gmail.com', 'LEK-06', 'Internista'),
    (7, 'Piotr', 'Kowalski', '777 777 777', '6@gmail.com', 'LEK-07', 'Neurolog'),
    (8, 'Konrad', 'Wiśniewski', '888 888 888', '7@gmail.com', 'LEK-08', 'Ortopeda'),
    (9, 'Jakub', 'Nowakowski', '999 999 999', '8@gmail.com', 'LEK-09', 'Okulista'),
    (10, 'Dominika', 'Nowak', '000 000 000', '9@gmail.com', 'LEK-10', 'Ortopeda'),
    (11, 'Maciej', 'Kowalski', '111 111 112', '10@gmail.com', 'LEK-11', 'Internista'),
    (12, 'Kamil', 'Wiśniewski', '111 111 113', '11@gmail.com', 'LEK-12', 'Neurolog'),
    (13, 'Małgorzata', 'Wiśniewski', '111 111 114', '12@gmail.com', 'LEK-13', 'Okulista'),
    (14, 'Joanna', 'Nowak', '111 111 115', '13@gmail.com', 'LEK-14', 'Neurolog'),
    (15, 'Jakub', 'Kowalski', '111 111 116', '14@gmail.com', 'LEK-15', 'Ortopeda');


-- Dodawanie pacjentów
INSERT INTO PATIENT (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, firts_visit)
VALUES
    (1, 'Kamil', 'Kowalski', '111 111 111', '1@o2.pl', 'P-1111', '1995-03-15', true),
    (2, 'Konrad', 'Nowak', '222 222 222', '2@o2.pl', 'P-2222', '1980-11-25', false),
    (3, 'Marcin', 'Wiśniewski', '333 333 333', '3@o2.pl', 'P-3333', '1996-05-22', true),
    (4, 'Joanna', 'Nowakowski', '444 444 444', '4@o2.pl', 'P-4444', '1980-04-10', false),
    (5, 'Małgorzata', 'Nowak', '555 555 555', '5@o2.pl', 'P-5555', '1985-07-22', true),
    (6, 'Jan', 'Wiśniewski', '666 666 666', '6@o2.pl', 'P-6666', '1972-01-25', false),
    (7, 'Kamil', 'Kowalski', '777 777 777', '7@o2.pl', 'P-7777', '1977-08-12', true),
    (8, 'Konrad', 'Nowak', '888 888 888', '8@o2.pl', 'P-8888', '1982-11-28', false),
    (9, 'Joanna', 'Kowalski', '999 999 999', '9@o2.pl', 'P-9999', '1998-02-12', true),
    (10, 'Marcin', 'Wiśniewski', '000 000 000', '10@o2.pl', 'P-1010', '1987-03-28', false),
    (11, 'Konrad', 'Nowak', '111 111 112', '11@o2.pl', 'P-1011', '1994-12-31', true),
    (12, 'Małgorzata', 'Kowalski', '111 111 113', '12@o2.pl', 'P-1012', '1989-12-22', false),
    (13, 'Konrad', 'Wiśniewski', '111 111 114', '13@o2.pl', 'P-1013', '1996-02-15', true),
    (14, 'Marcin', 'Nowak', '111 111 115', '14@o2.pl', 'P-1014', '1970-03-21', false),
    (15, 'Kamil', 'Wiśniewski', '111 111 116', '15@o2.pl', 'P-1015', '1973-11-25', true);

-- Dodawanie wizyt
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (1, 'Wizyta internistyczna', '2024-04-20 08:00:00', 2, 1),
    (2, 'Wypisanie recepty', '2024-04-20 09:00:00', 2, 2),
    (3, 'Szczepienie', '2024-04-20 10:00:00', 3, 3),
    (4, 'Konstultacja medyczna', '2024-04-20 11:00:00', 4, 4),
    (5, 'Wizyta internistyczna', '2024-04-20 12:00:00', 5, 5),
    (6, 'Wypisanie recepty', '2024-04-20 13:00:00', 1, 2),
    (7, 'Szczepienie', '2024-04-20 14:00:00', 2, 3),
    (8, 'Wizyta internistyczna', '2024-04-21 08:00:00', 3, 4),
    (9, 'Wypisanie recepty', '2024-04-21 09:00:00', 4, 5),
    (10, 'Szczepienie', '2024-04-21 10:00:00', 5, 6),
    (11, 'Konstultacja medyczna', '2024-04-21 11:00:00', 6, 7),
    (12, 'Wypisanie recepty', '2024-04-22 10:00:00', 7, 8),
    (13, 'Szczepienie', '2024-04-22 11:00:00', 9, 10),
    (14, 'Wizyta internistyczna', '2024-04-22 12:00:00', 10, 11),
    (15, 'Konstultacja medyczna', '2024-04-22 13:00:00', 11, 12);

-- Dodawanie leczenia
INSERT INTO MEDICAL_TREATMENT (id, description, type, VISIT_ID)
VALUES
    (1, 'Morfologia', 'Morfologia', 1),
    (2, 'Test na narkotyki', 'Mofrologia', 2),
    (3, 'RTG klatki piersiowej', 'RTG', 3),
    (4, 'RTG miednicy', 'RTG', 4),
    (5, 'RTG kończyn górnych', 'RTG', 5),
    (6, 'RTG kończyn dolnych', 'RTG', 6),
    (7, 'EKG', 'EKG', 7),
    (8, 'Holter', 'EKG', 8),
    (9, 'USG jamy brzusznej', 'USG', 9),
    (10, 'USG tkanek miękkich', 'USG', 10),
    (11, 'USG ginekologiczne', 'USG', 11),
    (12, 'USG naczyniowe', 'USG', 12),
    (13, 'USG kostno-szkieletowe', 'USG', 13),
    (14, 'USG narządowe', 'USG', 14),
    (15, 'Inne', 'Inne', 15);