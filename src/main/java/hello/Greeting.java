package hello;

public class Greeting {
  private final long id;
  private final String content;

  public Greeting(long id, String content){
    this.id = id;
    this.content = content;
  }

  //getters, can be generated with Annotations
  public long getId(){
    return this.id;
  }

  public String getContent(){
    return this.content;
  }
}
