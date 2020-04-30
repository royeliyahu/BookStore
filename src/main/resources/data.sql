INSERT INTO topic (id, name, description) VALUES
  ('Spring', 'Spring Framework', 'Spring Framework description'),
  ('Java', 'Core Java', 'Core Java Description'),
  ('Rock', 'Rock & Roll', 'Rock & Roll description'),
  ('lala', 'lala', 'lala'),
  ('active', 'active', 'active'),
  ('Rich', 'mom', 'active'),
  ('lolo', 'lolo', 'lolo');


INSERT INTO author(id, name) VALUES
    (1, 'David Grosman'),
    (2, 'Meir Shalev'),
    (3, 'Yehuda Amichai'),
    (4, 'Dan Brown');

INSERT INTO book(id, name, pages, author_id, publisher) VALUES
    ('1', 'book 1', 123, 1, 'Amichai'),
    ('2', 'book 2', 128, 1, 'Am'),
    ('3', 'book 3', 153, 2, 'Amichai'),
    ('4', 'book 4', 13, 2, 'Modan'),
    ('5', 'book 5', 123, 3, 'Yediot'),
    ('6', 'book 6', 153, 1, 'Modan'),
    ('7', 'book 7', 123, 4, 'AmOved'),
    ('8', 'book 8', 13, 4, 'Maraiv'),
    ('9', 'book 9', 1153, 4, 'Amichai');

