-- Insert sample movies
INSERT INTO movies (title, genre, release_date, director) VALUES 
('The Shawshank Redemption', 'Drama', '1994-09-22', 'Frank Darabont'),
('The Dark Knight', 'Action', '2008-07-18', 'Christopher Nolan'),
('Inception', 'Sci-Fi', '2010-07-16', 'Christopher Nolan');

-- Insert sample ratings
INSERT INTO ratings (score, username, movie_id) VALUES 
(9, 'user1', 1),
(10, 'user2', 1),
(8, 'user1', 2),
(9, 'user3', 2),
(7, 'user2', 3);

-- Insert sample comments
INSERT INTO comments (content, comment_date, username, movie_id) VALUES 
('Amazing movie, a must-watch!', CURRENT_TIMESTAMP, 'user1', 1),
('Loved the storyline and characters.', CURRENT_TIMESTAMP, 'user2', 1),
('Action-packed and thrilling!', CURRENT_TIMESTAMP, 'user3', 2),
('Mind-bending and visually stunning.', CURRENT_TIMESTAMP, 'user1', 3),
('Nolan did it again!', CURRENT_TIMESTAMP, 'user2', 3);
