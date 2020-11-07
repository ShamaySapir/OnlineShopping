package shopping;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static String chooseForCase(String choose){

        int index=0;
        String[] Dic = {"Add WebUser","Exit","Remove WebUser","Login WebUser","Logout WebUser","Make order","Display order","Link Product","Add Product","Delete Product","ShowAllObjects","ShowObjectId" };

        for (int i=0; i<Dic.length; i++){

            if(choose.startsWith(Dic[i])) {
                index = i;
                break;
            }
        }
        return Dic[index];
    }

    public static void main(String[] args) {
       // ShoppingSystem shoppingSystem = new  ShoppingSystem();

        boolean flag = true;

        while (flag){

            Scanner myObj = new Scanner(System.in);
            System.out.println("please enter one of the following commnads:\n1.Add WebUser *Login_id*" +
                    "\n2.Remove WebUser *Login_id*\n3.Login WebUser *Login_id*\n4.Logout WebUser *Login_id*" +
                    "\n5.Make order\n6.Display order\n7.Link Product *Product_name*\n8.Add Product " +
                    "\n9.Delete Product *Product_name*\n10.ShowAllObjects\n11.ShowObjectId *id*\n12.Exit");

            String choose = myObj.nextLine();
            String command = chooseForCase(choose);
            String[] listChoose = choose.split(" ");


            switch (command){
                case "Add WebUser":
                    String id = listChoose[2];
                    // Arg Web User
                    System.out.println("Enter Password");
                    String Password = myObj.nextLine();
                    // Arg Customer
                    System.out.println("Enter country");
                    String country = myObj.nextLine();
                    System.out.println("Enter City");
                    String city = myObj.nextLine();
                    System.out.println("Enter Street");
                    String Street = myObj.nextLine();
                    System.out.println("Enter Phone");
                    String Phone = myObj.nextLine();
                    System.out.println("Enter Email");
                    String Email = myObj.nextLine();
                    // Arg Account
                    System.out.println("Enter Billing Address");
                    String billingAddress = myObj.nextLine();
                    System.out.println("Enter your balance");
                    String balance = myObj.nextLine();
                    System.out.println("Are you a Premium Account? yes/no");
                    String premium_account = myObj.nextLine();
                    premium_account=premium_account.toLowerCase();

                    Boolean premiumAccount;

                    if(premium_account == "yes"){
                        premiumAccount=true;
                    }
                    else {
                        premiumAccount = false;
                    }

                    //shoppingSystem.addWebUser(id,Password,country,city,balance,Street,Phone,Email,billingAddress,premiumAccount);
                    break;

                case "Remove WebUser":

                    String idRemove = listChoose[2];
                    //shoppingSystem.removeWebUser(idRemove);
                    break;

                case "Login WebUser":
                    Boolean check = false;

                    while (!check){

                        String removeId=listChoose[2];
                        System.out.println("Enter Password");
                        String password = myObj.nextLine();
                     //   check = shoppingSystem.verifyLogin(removeId,password);
                    }
                    break;

                case "Logout WebUser":
                    String logOutId = listChoose[2];
                   //shoppingSystem.logOut(logOutId);
                    break;

                case "Make order":
                    System.out.println("Enter Seller Name");
                    String nameseller =myObj.nextLine();
                   // List<Product> listProduct = shoppingSystem.showSellerProduct(nameseller);

                   /* for (int i=0; i <listProduct.size() ;i++){
                        Product product = listProduct.get(i);
                        System.out.println(product.getName());
                    }*/

                    Boolean flagProudct=false;
                    while (!flagProudct){
                        System.out.println("please choose a product:");
                        String product =myObj.nextLine();
                        System.out.println("Enter quantity:");
                        String quantity =myObj.nextLine();

                        Product p1 = null;
                       /* for(int i = 0 ; i< listProduct.size();i++){
                            if (product == (listProduct.get(i)).getName()){
                                p1=listProduct.get(i);
                            }

                        }*/
                        //shoppingSystem.addToShoppingCart(p1,quantity);
                        System.out.println("you want more product? Y/N");
                        String nextItem =myObj.nextLine();

                        if (nextItem == "N")
                            flagProudct=true;
                    }

                    break;

                case "Display order":
                 //   sys.getLastOrder();
                    break;

                case "Link Product":
                    String Product_name = listChoose[2];
                    System.out.println("Enter quantity");
                    String quantity = myObj.nextLine();
                    int quantity1 =Integer.parseInt(quantity);
                    System.out.println("Enter price");
                    String price = myObj.nextLine();
                    int price1 =Integer.parseInt(price);


                   // shoppingSystem.addProductToAccount(Product_name,quantity1,price1);
                    break;

                case "Add Product":
                    String NameNewPro = listChoose[2];
                    System.out.println("Enter ID");
                    String productID = myObj.nextLine();
                    System.out.println("Enter Supplier");
                    String SupplierName = myObj.nextLine();
                    System.out.println("Enter SupplierID");
                    String SupplierID = myObj.nextLine();

                   // shoppingSystem.addProduct(NameNewPro,productID,SupplierName,SupplierID);
                    break;
                case "Delete Product":
                    String ProductNameDelete = listChoose[2];
                  //  shoppingSystem.DeleteProduct(ProductNameDelete);
                    break;
                case "ShowAllObjects":
                    //shoppingSystem.showAllObject();
                    break;
                case "ShowObjectId":
                    String idObject = listChoose[2];
                    //shoppingSystem.ShowObjectId(idObject);
                    break;
                case "Exit":
                    flag = false;
                    break;
            }
        }


    }
}
