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
    (3, 'Yehuda Amichai');

INSERT INTO book(id, name, pages, author_id, publisher) VALUES
    ('1', 'book 1', 123, 1, 'Amichai'),
    ('2', 'book 2', 128, 1, 'Am'),
    ('3', 'book 3', 153, 2, 'Amichai'),
    ('4', 'book 4', 13, 2, 'Modan'),
    ('5', 'book 5', 123, 3, 'Yediot');

