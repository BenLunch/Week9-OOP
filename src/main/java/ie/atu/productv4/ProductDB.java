package ie.atu.productv4;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myItem = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Progression");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myItem = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Services and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myItem = myBook;
        } else if (productCode.equalsIgnoreCase("mySQL")) {
            Book myBook = new Book();
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(57.50);
            myBook.setAuthor("Jim Lennon");
            myItem = myBook;
        }
        else if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myItem = mySoftware;
        } else if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Group");
            myItem = myMusic;
        } else if (productCode.equalsIgnoreCase("kdl43")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTv.setPrice(819.00);
            myTv.setManufacture("Sony");
            myTv.setScreenSize("55");
            myItem = myTv;
        }

        return myItem;
    }

}

