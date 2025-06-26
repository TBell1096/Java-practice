package org.example;

import org.example.service.CartService;
import org.example.utilities.TerminalUtilities;

public class CheckOutCart {
    public static double checkOutTotal(CartService service) {
        TerminalUtilities utils = new TerminalUtilities();
        double totalCost = service.checkOut();
        utils.displayMessage(String.format("your total cost is: %.2f\n", totalCost));
        return totalCost;
    }


}
