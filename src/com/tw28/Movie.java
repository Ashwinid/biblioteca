package com.tw28;

    public class Movie {
       private String movie_name;
        private String director_name;
        private String rating;

       public void add(String movie_name,String director_name, String rating)
        {
            this.movie_name=movie_name;
            this.director_name=director_name;
            this.rating=rating;

        }

        public void display()
        {
               System.out.println(movie_name+" -->> "+director_name+" -->> "+rating);

         }
    }
