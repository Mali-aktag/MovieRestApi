GET     /api/comments                     -> getAllComments
GET     /api/comments/{id}                -> getCommentById
POST    /api/comments                     -> addComment
PUT     /api/comments/{id}                -> updateComment
DELETE  /api/comments/{id}                -> deleteComment
GET     /api/comments/movie/{movieId}     -> findCommentsByMovieId
GET     /api/comments/user/{user}         -> findCommentsByUser

GET     /api/movies                       -> getAllMovies
GET     /api/movies/{id}                  -> getMovieById
POST    /api/movies                       -> addMovie
PUT     /api/movies/{id}                  -> updateMovie
DELETE  /api/movies/{id}                  -> deleteMovie
GET     /api/movies/recommendations       -> getMovieRecommendations
GET     /api/movies/search                -> searchMoviesByTitleOrGenre

GET     /api/ratings                      -> getAllRatings
GET     /api/ratings/{id}                 -> getRatingById
POST    /api/ratings                      -> addRating
PUT     /api/ratings/{id}                 -> updateRating
DELETE  /api/ratings/{id}                 -> deleteRating
GET     /api/ratings/movie/{movieId}      -> findRatingsByMovieId
GET     /api/ratings/user/{user}          -> findRatingsByUser

http://localhost:8089

