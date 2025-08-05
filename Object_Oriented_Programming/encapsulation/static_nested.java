package oops.encapsulation;

class Movie{
    String name;
    int rating;
    int view;
    Movie(String name, int rating , int view){
        this.name=name;
        this.rating=rating;
        this.view=view;
    }
    public void getMovie(){
         // if we dont make nested class static then we have to create object 
                            //of nested class in main class then we can call it.
        //if we make nested class static then we dont have to create object we can directly call it via this..
        System.out.println(this.name+" "+this.rating+" " +this.view);
    }
     class Theater{   //nested static.
        int bookingNo=12454;
        String day="Monday";
        String shift="Noon";
        static String language = "Hindi";

     }
        // Theater(int bookingNo , String day, String shift){
        //     this.bookingNo=bookingNo;
        //     this.day=day;
        //     this.shift=shift;
        // }
        public void getTheater(){
            Theater obj = new Theater();
            System.out.println(obj.bookingNo+" "+ obj.day+" "+obj.shift/*+" "+obj.language */);
        }
        public void getLanguage(){
            System.out.println(Theater.language);
        }
    

}

public class static_nested {
    public static void main(String[] args) {
        // Theater show = new Theater(1254, "Friday", "noon");
         Movie show = new Movie("Geekster",5 ,1000 );
        // Movie.Theater inox = new Movie.Theater();
        // show.getMovie();
        show.getTheater();
        show.getLanguage();
       
    }
}
