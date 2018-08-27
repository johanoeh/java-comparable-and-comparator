public class Royalty implements Comparable<Royalty> {

  private String name;
  private Integer age;

  public Royalty(String name, int age){
    this.name = name; 
    this.age = age;
  }
  
  @Override
  public int compareTo(Royalty royalty){
    if(age == royalty.age) return 0;
    if(age < royalty.age) return -1;
    else return 1;
  }
  
  public void setName(String name){ this.name = name;}
  public void setAge(Integer age){ this.age = age;}
  public String getName(){ return name;}
  public int getAge(){ return age;}

  @Override
  public String toString(){ return name+" : "+ age;}

}
