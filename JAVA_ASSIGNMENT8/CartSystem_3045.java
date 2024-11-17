import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CartSystem_3045 extends JFrame {
    String[][] items = {
        {"Green Women-Maxi dress", "78"},
        {"White Women dress", "166"},
        {"Men Blue-White shirt", "40"},
        {"Summer Women-maxi", "50"},
        {"Red Women-Maxi dress", "200"},
        {"Men's white shirt", "100"}
    };
    
    ArrayList<String[]> cartItems = new ArrayList<>();
    String[] paths_for_icons = {
        "./Items/dress1.jfif",
        "./Items/dress2.jfif",
        "./Items/dress3.jpg",
        "./Items/dress4.jfif",
        "./Items/dress5.jfif",
        "./Items/dress6.jfif"
    };

    public CartSystem_3045() {
        setTitle("Shopping Cart");
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Create a panel to hold the items
        JPanel itemsPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        JScrollPane scrollPane = new JScrollPane(itemsPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Display each item with its image, name, price, and an "Add to Cart" button
        for (int i = 0; i < items.length; i++) {
            JPanel itemPanel = new JPanel(new BorderLayout());

            // Load and display the image of the item
            JLabel itemImageLabel = new JLabel();
            ImageIcon icon = new ImageIcon(paths_for_icons[i]);
            Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            itemImageLabel.setIcon(new ImageIcon(scaledImage));
            itemPanel.add(itemImageLabel, BorderLayout.WEST);

            // Item name and price
            JLabel itemName = new JLabel(items[i][0] + " - $" + items[i][1]);

            // Add to Cart button
            JButton addToCartButton = new JButton("Add to Cart");
            final int index = i;
            addToCartButton.addActionListener(e -> {
                cartItems.add(items[index]);
                JOptionPane.showMessageDialog(null, items[index][0] + " has been added to the cart.");
            });

            // Add item name and button to the panel
            JPanel infoPanel = new JPanel(new BorderLayout());
            infoPanel.add(itemName, BorderLayout.CENTER);
            infoPanel.add(addToCartButton, BorderLayout.EAST);

            itemPanel.add(infoPanel, BorderLayout.CENTER);
            itemsPanel.add(itemPanel);
        }

        // Add a "Display Cart" button and "Checkout" button
        JPanel bottomPanel = new JPanel(new FlowLayout());

        JButton displayCartButton = new JButton("Display Cart");
        displayCartButton.addActionListener(e -> displayCart());

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.addActionListener(e -> checkout());

        bottomPanel.add(displayCartButton);
        bottomPanel.add(checkoutButton);

        add(bottomPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Method to display the items in the cart with a remove button
    private void displayCart() {
        JFrame cartFrame = new JFrame("Cart");
        cartFrame.setSize(400, 300);
        cartFrame.setLayout(new BorderLayout());

        JPanel cartPanel = new JPanel(new GridLayout(0, 1));
        JScrollPane cartScrollPane = new JScrollPane(cartPanel);
        cartFrame.add(cartScrollPane, BorderLayout.CENTER);

        // Display items in the cart with a remove button for each
        for (int i = 0; i < cartItems.size(); i++) {
            JPanel cartItemPanel = new JPanel(new BorderLayout());
            JLabel cartItemLabel = new JLabel(cartItems.get(i)[0] + " - $" + cartItems.get(i)[1]);

            JButton removeButton = new JButton("Remove");
            final int index = i;  // Need a final variable to reference within ActionListener
            removeButton.addActionListener(e -> {
                cartItems.remove(index);
                cartFrame.dispose();  // Close the cart frame
                displayCart();        // Reopen the cart frame to refresh the cart items
            });

            cartItemPanel.add(cartItemLabel, BorderLayout.CENTER);
            cartItemPanel.add(removeButton, BorderLayout.EAST);
            cartPanel.add(cartItemPanel);
        }

        cartFrame.setVisible(true);
    }

    // Method to calculate total and display checkout info
    private void checkout() {
        double total = 0;
        for (String[] item : cartItems) {
            total += Double.parseDouble(item[1]);
        }

        JOptionPane.showMessageDialog(null, "Total amount to pay: $" + total);
    }

    public static void main(String[] args) {
        new CartSystem_3045();
    }
}
