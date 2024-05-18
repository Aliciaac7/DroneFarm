package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller implements Initializable {
	
	@FXML
	private TreeView<String> treeView; 
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TreeItem<String> root = new TreeItem<>("Farm");
		treeView.setRoot(root);	

	}
	String[] item = {};
//	@FXML
    public void addItemContainer(ActionEvent e) {
       
        TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
           
            TreeItem<String> newItemContainer = new TreeItem<>("New Item Container");
            selectedItem.getChildren().add(newItemContainer);
            selectedItem.setExpanded(true);
        } 
	}
	
	public void addItem(ActionEvent e) {
		
        TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            
            TreeItem<String> newItem = new TreeItem<>("New Item");
            selectedItem.getChildren().add(newItem);
            selectedItem.setExpanded(true);
        }
	}
	
	
	public void deleteSelected(ActionEvent e) {
		
        TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();
       
        if (selectedItem != null) {
        	
            selectedItem.getParent().getChildren().remove(selectedItem);
            selectedItem.setExpanded(true);
        }
	}
	
	
	@FXML
	private TextField nameText; 
	@FXML
	private Button saveBut; 
	String setName;
	@FXML
	private ListView itemView;
//	String[] item = {};
	
	public void setName(ActionEvent e) {
		
		TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();
		
		if (selectedItem != null) {
		
			selectedItem.setValue(nameText.getText());
	
			itemView.getItems().add(nameText.getText());
		
	        selectedItem.setExpanded(true);
		}
	}
	
	
	public void changeName(ActionEvent e) {
		
		TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();
		
		if (selectedItem != null) {
		
			selectedItem.setValue(nameText.getText());
			
			
			itemView.getItems().add(nameText.getText());
	        
	        selectedItem.setExpanded(true);
		}
	}
	
	
	@FXML
	private TextField priceText; 
	int price; 
	
	public void setPrice(ActionEvent e) {
		TreeItem<String> selectedItem = treeView.getSelectionModel().getSelectedItem();
		
		if (selectedItem != null) {
		
			price = Integer.parseInt(priceText.getText());
			selectedItem.setExpanded(true);
		}
	}
	
	
	
	
	public void selectItem() {
		TreeItem<String> selectedItem  = treeView.getSelectionModel().getSelectedItem();
	}
	
	

	
	

}
