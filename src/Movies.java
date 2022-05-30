public class Movies {

  private long id;
  private String title;
  private long year;
  private double price;
  private String leadActor;

  public Movies(String title, long year, double price, String leadActor) {
    this.title = title;
    this.year = year;
    this.price = price;
    this.leadActor = leadActor;
  }

  public Movies(String title, long year, double price) {
    this.title = title;
    this.year = year;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public long getYear() {
    return year;
  }

  public void setYear(long year) {
    this.year = year;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getLeadActor() {
    return leadActor;
  }

  public void setLeadActor(String leadActor) {
    this.leadActor = leadActor;
  }

}
