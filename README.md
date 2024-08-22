# BookMyShow Entertainment Booking System

This project is a Java-based console application inspired by the BookMyShow platform. It allows users to book entertainment options, including movies, concerts, and comedy shows, after securely logging in or signing up. Users can choose their preferred entertainment, select from various options, and purchase additional items like popcorn, drinks, and snacks.

## Features

- **User Authentication**:
  - **Signup**: Create an account by providing an email ID and password.
  - **Login**: Securely log in using your email ID and password. The system checks if the credentials match, ensuring secure access.

- **Entertainment Booking**:
  - **Movies**:
    - Select movies across multiple languages and regions (e.g., Hindi, Kannada, Tamil, Punjabi).
    - Choose the city where you want to watch the movie (e.g., Delhi, Chennai, Bangalore).
    - Purchase additional items like popcorn, drinks, and snacks.
  - **Comedy Shows**:
    - Choose from different comedians and show timings.
    - Select the venue for the show (e.g., Delhi, Noida, Gurgaon).
    - Optionally, purchase popcorn and drinks.
  - **Concerts**:
    - Choose from different types of concerts.
    - Select the venue (e.g., Delhi, Noida, Gurgaon).
    - Additional purchases like food and drinks are available.

## How to Use

1. **Run the Application**: Launch the application from the console.
2. **Sign Up or Log In**:
   - If you already have an account, log in with your email ID and password.
   - If you don't have an account, sign up first and then log in.
3. **Select Entertainment Type**: After logging in, choose between Movies, Concerts, or Comedy Shows.
4. **Choose Location**: Depending on your choice, select the city or venue for your entertainment.
5. **Complete Booking**: Follow the prompts to finalize your booking, including any additional purchases.

## Project Structure

- **BookMyShow.java**: Handles user authentication, selection of entertainment type, and location-based options.
- **Movies.java**: Manages movie selections and additional purchases.
- **Comedy.java**: Manages comedy show bookings and related options.
- **Concert.java**: Manages concert bookings and additional services.
- **BookMyShowUser.java**: The main class that runs the application, guiding users through the login and booking process.

## Getting Started

1. Clone the repository.
2. Compile the Java files using `javac`.
3. Run the application with `java BookMyShowUser`.
   
## Author
**Your Name - [Shivam Chauhan](https://www.linkedin.com/in/chauhan21shivam)**
