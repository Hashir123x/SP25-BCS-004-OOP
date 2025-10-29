public class BlockDemo {

    public static void main(String[] args) {

        Block blockA = new Block("Block A");
        System.out.println("============ BLOCK SUMMARY ============");
        System.out.println(blockA);
        System.out.println("\nTotal Plots in Block A: " + blockA.totalPlots());
        System.out.println("Currently Available Plots: " + blockA.availablePlots());

        System.out.println("\n============ BOOKING TEST ============");
        String idToBook = "S3-007";  // Street 3, Plot 7
        boolean booked = blockA.booking(idToBook);
        if (!booked)
            System.out.println("Plot " + idToBook + " successfully booked!");
        else
            System.out.println("Plot " + idToBook + " could NOT be booked!");
        boolean bookedAgain = blockA.booking(idToBook);
        if (!bookedAgain)
            System.out.println("Plot " + idToBook + " booked again (should not happen)!");
        else
            System.out.println("Booking attempt rejected correctly for " + idToBook);
        System.out.println("\n============ CANCELLATION TEST ============");
        boolean cancelled = blockA.CancelBooking(idToBook);
        if (cancelled)
            System.out.println("Plot " + idToBook + " booking cancelled!");
        else
            System.out.println("Plot " + idToBook + " was not booked.");

        // 6. Show available and booked lists
        System.out.println("\n============ PLOT STATUS LISTS ============");
        blockA.ReturnLists();
        System.out.println("\n============ SEARCH TEST ============");
        blockA.firstavailable(PlotSize.RESIDENTIAL_KANAL);
        System.out.println("\n============ RANDOM BOOKING TEST ============");
        blockA.randombooking();
        System.out.println("After random booking:");
        System.out.println("Available plots: " + blockA.availablePlots());
    }
}
