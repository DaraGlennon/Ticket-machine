    public static void main(String[] args) {
        double one = 0;
        double oneday = 0.5;
        double twoday = 0.9;
        double onedaysingle = 0.3;
        double twodaysingle = 0.5;
        double musicevent = 0.25;
	//fees
        double fee1 = .07;
        double fee2 = .05;
        double fee3 = .03;
        double fee4 = .035;
        double fee5 = .025;
	// multiplication
        double percentage1 = (50 * .07) + 50;
        double percentage2 = (90 * .05) + 90;
        double percentage3 = (30 * .03) +30;
        double percentage4 = (50 * .035) + 50;
        double percentage5 = (25 * .25) + 25;
        int x;
        int totalcost;
        double totaltickets;
        
                
// loop to make it popup 5 times
        for (x = 1; x <= 5; x++) {

            int ticket = Integer.parseInt(JOptionPane.showInputDialog("which type of ticket do you wants?"
                    + "\n 1. One Day Family Ticket"
                    + "\n 2. Two day Family ticket"
                    + "\n 3. One day Single ticket"
                    + "\n 4. Two day Single ticket"
                    + "\n 5. Music Events ticket only"));
            int numTickets;
            numTickets = Integer.parseInt(JOptionPane.showInputDialog("How many tickets would you like to purchase"));

            if (ticket == 1) {
                double f1 = one * numTickets;
                double cost = percentage1 + f1;
                JOptionPane.showMessageDialog(null, "€" + cost);
                JOptionPane.showMessageDialog(null, " One Day Family Ticket" + "\n Total amount of tickets:" + numTickets  + f1 + "\n Price: €" + cost);
                

            } else if (ticket == 2) {
                double f2 = one * numTickets;
                double cost2 = percentage2 + f2;
                JOptionPane.showMessageDialog(null, "€" + cost2);
                JOptionPane.showMessageDialog(null, " Two day Family ticket" + "\n Total amount of tickets:" + numTickets  + f2 + "\n Price: €" + cost2);

            } else if (ticket == 3) {
                double f3 = one * numTickets;
                double cost3 = percentage3 + f3;
                JOptionPane.showMessageDialog(null, "€" + cost3);
                JOptionPane.showMessageDialog(null, " One day Single ticket " + "\n Total amount of tickets:" + numTickets  + f3 + "\n Price: €" + cost3);

            } else if (ticket == 4) {
                double f4 = one * numTickets;
                double cost4 = fee4 + f4;
                JOptionPane.showMessageDialog(null, "€" + cost4);
                JOptionPane.showMessageDialog(null, " Two day Single ticket" + "\n Total amount of tickets:" + numTickets  + f4 + "\n Price: €" + cost4);

            } else if (ticket == 5) {
                double f5 = one * numTickets;
                double cost5 = fee5 + f5;
                JOptionPane.showMessageDialog(null, "€" + cost5);
                JOptionPane.showMessageDialog(null, " Music events only ticket" + "\n Total amount of tickets:" + numTickets  + f5 + "\n Price: €" + cost5);
            }

    }
    
}


    }
    
}
