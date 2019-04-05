package Registration.Programlogic;

class Person {
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
