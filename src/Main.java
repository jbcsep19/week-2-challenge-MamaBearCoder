import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int burritoYum = 0;

        while (burritoYum < 25) {
            //generate random # of ingredients
            int randomIng = RandomNumberRange(5, 9);

            System.out.println(Burrito(randomIng) + " is $" + price(randomIng));

            burritoYum++;

        }

    }

    //Calculate price

    public static float price (int ingNum){
        float price = (float)3.0;
        float extraPrice = (float) 0.5;
        float cost = 0;

        if(ingNum > 5) {
            int NumExtras = ingNum - 5;
            cost = (float) (NumExtras * extraPrice) + price;
            return cost;
        }
        else{
            cost = price;
            return cost;
        }


    }
    public static int RandomNumberRange(int min, int max)
    {
        //Declare the random r
        Random r = new Random();
        //Return the random number between the min and max number as an integer.
        return r.ints(min, (max +1)).limit(1).findFirst().getAsInt();

    }
    public static String Burrito(int NumIng){
        Random ingredients=new Random();
        String[]rice={"white rice","brown rice","no rice","all the rice"};
        String[]meat={"chicken","steak","carnidas","chorizo","sofritas","no meat","all the meat"};
        String[]beans={"pinto beans","black beans","no beans"};
        String[]salsa={"mild salsa","medium salsa","hot salsa","no salsa","all the salsas"};
        String[]veggies={"lettuce","fajita veggies","no veggies","all the veggies"};
        String[]cheese={"cheese","no cheese"};
        String[]guac={"guac","no guac"};
        String[]queso={"queso","no queso"};
        String[]sourCream={"sour cream","no sour cream"};

        //random generator
        int riceRandom=ingredients.nextInt(rice.length);
        int meatRandom=ingredients.nextInt(meat.length);
        int beansRandom=ingredients.nextInt(beans.length);
        int salsaRandom=ingredients.nextInt(salsa.length);
        int veggiesRandom=ingredients.nextInt(veggies.length);
        int cheeseRandom=ingredients.nextInt(cheese.length);
        int guacRandom=ingredients.nextInt(guac.length);
        int quesoRandom=ingredients.nextInt(queso.length);
        int sourCreamRandom=ingredients.nextInt(sourCream.length);

        switch(NumIng){
            case 5:
                return"Burrito with"+ " " + rice[riceRandom]+", "+meat[meatRandom]+", "+beans[beansRandom]+", "+salsa[salsaRandom]+", "+veggies[veggiesRandom];

            case 6:
                return"Burrito with"+ " " +rice[riceRandom]+", "+meat[meatRandom]+", "+beans[beansRandom]+", "+salsa[salsaRandom]+", "+veggies[veggiesRandom]+", "+cheese[cheeseRandom];

            case 7:
                return"Burrito with"+ " " + rice[riceRandom]+", "+meat[meatRandom]+", "+beans[beansRandom]+", "+salsa[salsaRandom]+", "+veggies[veggiesRandom]+", "+cheese[cheeseRandom]+", "+guac[guacRandom];

            case 8:
                return"Burrito with"+ " " + rice[riceRandom]+", "+meat[meatRandom]+", "+beans[beansRandom]+", "+salsa[salsaRandom]+", "+veggies[veggiesRandom]+", "+cheese[cheeseRandom]+", "+guac[guacRandom]+", "+queso[quesoRandom];

            case 9:
                return"Burrito with"+ " " + rice[riceRandom]+", "+meat[meatRandom]+", "+beans[beansRandom]+", "+salsa[salsaRandom]+", "+veggies[veggiesRandom]+", "+cheese[cheeseRandom]+", "+guac[guacRandom]+", "+queso[quesoRandom]+", "+sourCream[sourCreamRandom];
        }
        return null;


    }
}


