## Application Flow

### User sign up
1. Users sign up on main page and available on all pages unless signed in
1. User fills out form and submits
1. Request goes to sign up servlet
1. Servlet creates a user object and then creates user into the database.
1. Show a response after successfully adding by showing it on the jsp

### User Sign In
1. User signs in on the main also available on all pages.
1. User enters username and password on the form 
1. Wrong input causes errors and show message on page.

### View Library
1. Request to view the game library with all information such as owned game and for which system.
1. Dao performs a search on users library
1. Dao creates report objects from the results
1. Servlet sends list of games back to the library jsp
1. Library jsp displays games saved

### View Game
1. Page requests to view game servlet with all information (Title, description, rating, release data. etc.)
1. Servlet uses the game dao to select games according to the criteria
1. Dao performs select and creates game objects from results
1. Dao returns list of games to servlet
1. Servlet sends list to game jsp

### Add Game
1. Option only available to logged in users
1. User enters game details
1. Details are sent to Add game servlet
1. Servlet creates game
1. Servlet sends object to dao
1. Dao adds game to the database
1. Servlet sends confirmation to game page that the game has been added to the library.