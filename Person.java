package sample;

public class Person {
    protected String person_ID;
    protected String name;
    protected String email;

  Person(String person_ID,String name,String email){
      this.person_ID = person_ID;
      this.name = name;
      this.email = email;

  }

    public String getPerson_ID() {
        return person_ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}


class Contact_Person extends Person{
    private String website;
    private String affiliation;
    private String other_info;


   Contact_Person(String website,String affiliation,String other_info){
       super(person_ID, name, email);
       this.website = website;
       this.affiliation = affiliation;
       this.other_info = other_info;

   }

    public String getWebsite(){
        return website;
    }

    public String getAffiliation(){
        return affiliation;
    }

    public String getOther_info(){
        return other_info;
    }


}
