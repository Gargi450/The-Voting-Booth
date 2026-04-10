-- Create Database
CREATE DATABASE voting_system1;
-- Use Database 
USE voting_system1;

-- Create Candidates Table
CREATE TABLE candidates(
    cand_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    post VARCHAR(50)
);

-- Create Votes Table
CREATE TABLE votes(
    vote_id INT PRIMARY KEY AUTO_INCREMENT,
    voter_id VARCHAR(20),
    cand_id INT,
    post VARCHAR(50),
    voted_at DATETIME DEFAULT NOW(),
    FOREIGN KEY (cand_id) REFERENCES candidates(cand_id)
);