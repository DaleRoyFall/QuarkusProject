INSERT INTO movie.movie_category
(categoryName)
VALUES
('Action'),
('Fantasy'),
('Drama');

INSERT INTO movie.movie
(id, name, movieCategory)
VALUES
(1, '1+1', 'Drama'),
(2, 'The Lord of the Rings', 'Fantasy'),
(3, 'John Wick', 'Action');