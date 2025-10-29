public class SocietyDemo {
    public static void main(String[] args) {
        HousingSociety s = new HousingSociety("Lahore Housing Society");
        System.out.println(" Society created successfully!");
        s.printSummary();
        System.out.println("\n========= SOCIETY DETAILS =========");
        System.out.println(s);
        s.AddBlock(4);
        System.out.println("\n Added new block with 4 streets!");
        s.printSummary();
        System.out.println("\n========= BOOKING TEST =========");
        boolean booked = s.book("Block-A", "S1-001");
        if (!booked) {
            System.out.println("Plot booking failed (maybe already booked or not found).");
        } else {
            System.out.println("Plot successfully booked in Block-A, Plot S1-001!");
        }
        System.out.println("\n========= CANCELLATION TEST =========");
        boolean cancelled = s.cancel("Block-A", "S1-001");
        if (cancelled)
            System.out.println("Booking cancelled successfully!");
        else
            System.out.println("Cancellation failed (plot may already be available).");
        System.out.println("\n========= BLOCK SEARCH TEST =========");
        Block found = s.findBlockByName("Block-B");
        if (found != null) {
            System.out.println("Block found: " + found);
            System.out.println("Total Plots in Block-B = " + found.totalPlots());
        } else {
            System.out.println("Block not found!");
        }
        System.out.println("\n========= FINAL SUMMARY =========");
        s.printSummary();

        System.out.println("\n DEMO COMPLETED SUCCESSFULLY!");
    }
}
