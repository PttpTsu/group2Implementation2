package group2.group2remake;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;




//the center coordinates of visualization is x= 337, y = 325 make it as the origin(0,0)

//range of grid image lay out is x= 14, y = 0, to x = 653, y = 642
public class Controller implements Initializable {
    @FXML
    private TreeView assetTree;
    @FXML
    private AnchorPane visualAnchor;

    //display variables
    @FXML
    private Text nameDisplay;
    @FXML
    private Text xDisplay;
    @FXML
    private Text yDisplay;
    @FXML
    private Text priceDisplay;
    @FXML
    private Text totalPriceDisplay;
    @FXML
    private Text widthDisplay;
    @FXML
    private Text heightDisplay;
    //end of display variables
    @FXML
    private ListView optionList;

    private TreeItem currentSelectItem;



    //a list of value will be used if user adding new item
    //if you are using a pops up window that have a different controller
    //then it could be static and it can only use these static value to retrive user's input
    public static double x;
    public static double y;
    public static double price;
    public static double width;
    public static double height;
    public static String name;
    //end of the list




    //initialize the interface

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Root root = new Root();
        TreeItem rootItem = new TreeItem(root);
        Item i = new Item("item",10,10,10,10,10);
        TreeItem testItem = new TreeItem(i);
        rootItem.getChildren().add(testItem);

        assetTree.setRoot(rootItem);

    }


    //when item is selected in the treeView, do something here
    public void selectItem(){
        TreeItem item = (TreeItem)assetTree.getSelectionModel().getSelectedItem();
        if(item!=null){
            System.out.println(item.getValue().getClass().toString());
            this.currentSelectItem=item;
            if(item.getValue() instanceof Root){
                //clear the option first then adding new item
                optionList.getItems().clear();
                optionList.getItems().addAll("Add Item", "Change X", "Change Y","Change Width","Change Height");

            }
            if(item.getValue() instanceof Item){
                //clear the option first then adding new item
                optionList.getItems().clear();
                optionList.getItems().addAll("Add Item", "Change X", "Change Y","Change Width","Change Height","Change Price","Delete Item");
            }

        }
    }


    //basically, this will retrieve the option selected from the ListView optionList
    // and then it will use if-else statement to identify which option that user has chosed
    //then it will executed corresponding function
    //TDDO: add identify logic, and implement corresonding function
    //Functions: 1. change Name, 2. Change price, 3. Change X .4 Change Y, 5.change width 6. change height7. delete items 8. add items

    public void optionSelect(){
       OptionSelect(optionList.getSelectionModel().getSelectedItem().toString());
    }
    public void OptionSelect(String selectedOption) {
        switch (selectedOption) {
            case "Change Name":
                // Call the function to change the name
                changeName();
                break;
            case "Change Price":
                // Call the function to change the price
                changePrice();
                break;
            case "Change X":
                // Call the function to change X
                changeX();
                break;
            // Add more cases for other options
            case "Change Y":
                changeY();
                break;
            case "Add Item":
                addItem();
                break;
            case "Change Width":
                changeWidth();
                break;
            case "Change Height":
                changeHeight();
                break;
            case "Delete Item":
                deleteItem();
                break;
            default:
                // Handle default case or do nothing
                break;
        }
    }

// Implement your corresponding functions here


        //thses function below requires a pop window that retrieve one input value from the user
        //they will closed upon user finish enter the input
    public void changeName() {

        // Logic to change the name
    }

    public void changePrice() {
        // Logic to change the price
    }

    public void changeX() {
        // Logic to change X
    }
    public void changeY(){

    }

    public void changeWidth(){

    }
    public void changeHeight(){

    }
    //thses function above requires a pop window that retrieve one input value from the user

    //pops up a window that let user input name,price,x,y,width,height and create a Item class object based on that data
    // then it will add it onto a TreeItem, the it will add this treeItem as Children of selected Item
    public void addItem(){

    }
    public void deleteItem(){
        if(currentSelectItem!=null){
            currentSelectItem.getParent().getChildren().remove(currentSelectItem);
        }
    }

// Implement other functions as needed



}