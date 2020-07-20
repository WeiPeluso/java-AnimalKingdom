    package AnimalKingdom;

    public abstract class Animal {

           private static int maxId=0;
            protected int id;
            protected String name;
            public int year;

            public Animal(String name, int year) {
                this.id = maxId;
                this.name = name;
                this.year = year;
                maxId++;
            }

            public String eatFood(){
                return "I am "+name+" and I am eating food now";
            };

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getId() {
            return id;
        }

           abstract String move();
            abstract String breath();
            abstract String reproduce();


        @Override
        public String toString() {
            return "Animal{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", yearNamed=" + year +
                    '}';
        }
    }
