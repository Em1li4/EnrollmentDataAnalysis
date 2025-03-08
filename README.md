# EnrollmentDataAnalysis
This Java project analyzes secondary school enrollment data from a CSV file provided by the World Bank Open Data. The data includes enrollment percentages for various countries over a period of 60 years (1960-2019).   

## Project Structure

The project implements four main classes:

* **`Country`:** Represents a country with a code and name.
* **`CountryData`:** Extends `Country` to include an array of enrollment percentages for each year.
* **`WorldData`:** Manages a collection of `CountryData` objects, providing methods to load data from the CSV file, add countries, look up countries by code, and generate a string representation of the data.
* **`SchoolEnrollment`:** Contains the `main` method to run the program and perform some example data lookups and manipulations.

## Features

* Data loading and parsing from a CSV file.
* Object-oriented representation of countries and their enrollment data.
* Methods for data lookup and manipulation.
* String representation of data for display or analysis.
* Example usage in the `SchoolEnrollment` class.
