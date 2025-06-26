package org.example.commands;

import org.example.utilities.TerminalUtilities;
import org.example.data.Item;
import org.example.service.CartService;

public class RemoveItems {
TerminalUtilities utils = new TerminalUtilities();

public static void removeItem(CartService service) {
    TerminalUtilities utils = new TerminalUtilities();
    utils.displayMessage("Select a item.\n");
    int index = utils.getItemByIndex(service.getItemsList());
    utils.displayMessage("How many would you like remove: ");
    int amount = utils.getNumberInput();
    if (index != -1) {
        Item remove = service.removeItem(index, amount);
        utils.displayMessage(amount + " has been removed\n");
    }

}
}
