class DrugList {
    public String[] med;
    public int[] quan;
    public String[] antiB;
    public int[] quanAnti;
    public int Index;
    public int leftAmount;
    public int aMount = 0;

    public DrugList (String hlw) {
        medicine();
        quantity();
        antiBiotic();
        quantityBiotic();
    }

    public void medicine () {
        med = new String[5];
        med[0] = "0) A";
        med[1] = "1) B";
        med[2] = "2) C";
        med[3] = "3) D";
        med[4] = "4) E";
    }

    public void quantity() {
        quan = new int[5];
        quan[0] = 100;
        quan[1] = 100;
        quan[2] = 100;
        quan[3] = 100;
        quan[4] = 100;
    }

    public void looseQuantity(int amount, int index){
        quantity();
        this.Index = index;
        this.aMount = amount;
        if (index==0) {
            quan[0] = 100-amount;
            leftAmount = quan[0];
        }
        else if (index==1) {
            quan[1] = 100-amount;
            leftAmount = quan[1];
        }
        else if (index==2) {
            quan[2] = 100-amount;
            leftAmount = quan[2];
        }
        else if (index==3) {
            quan[3] = 100-amount;
            leftAmount = quan[3];
        }
        else if (index==4) {
            quan[4] = 100-amount;
            leftAmount = quan[4];
        }
    }

    public void looseQuantityBiotic(int amount, int index){
        this.Index = index;
        quantityBiotic();
        if (index==0) {
            quanAnti[0] = 50-amount;
            leftAmount = quanAnti[0];
        }
        else if (index==1) {
            quanAnti[1] = 50-amount;
            leftAmount = quanAnti[1];
        }
        else if (index==2) {
            quanAnti[2] = 50-amount;
            leftAmount = quanAnti[2];
        }
        else if (index==3) {
            quanAnti[3] = 50-amount;
            leftAmount = quanAnti[3];
        }
        else if (index==4) {
            quanAnti[4] = 50-amount;
            leftAmount = quanAnti[4];
        }
    }

    public void antiBiotic() {
        antiB = new String[5];
        antiB[0] = "0) AB";
        antiB[1] = "1) CD";
        antiB[2] = "2) EF";
        antiB[3] = "3) GH";
        antiB[4] = "4) OP";
    }

    public void quantityBiotic() {
        quanAnti = new int[5];
        quanAnti[0] = 50;
        quanAnti[1] = 50;
        quanAnti[2] = 50;
        quanAnti[3] = 50;
        quanAnti[4] = 50;
    }

    public void methodCall(int option) {
        try {
            if (option == 1) {
                medicine();
            } else if (option == 2) {
                antiBiotic();
            } else
            throw new OptionException(option);
        } catch (OptionException e) {
            System.out.println(e);
        }
    }

    public String indexOfMedicine(int index) {
        try {
            if (index<0 || index>4)
                throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You give wrong index number, Please try again!!" + "\n" + "\n" + "\n" + "\n");
        }
        Index = index;
        return med[index];
    }

    public String indexOfAntiB(int index) {
        try {
            if (index<0 || index>4)
                throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You give wrong index number, Please try again!!" + "\n" + "\n" + "\n" + "\n");
        }
        Index = index;
        return antiB[index];
    }

    public String toString() {
        return "Available: " + "\n"
                +"Medicine List Given Bellow: " + "\n"
                + med[0] + ", Quantity: " + quan[0] + ", Per Piece Price: 5taka" + "\n"
                + med[1] + ", Quantity: " + quan[1] + ", Per Piece Price: 10taka" + "\n"
                + med[2] + ", Quantity: " + quan[2] + ", Per Piece Price: 15taka" + "\n"
                + med[3] + ", Quantity: " + quan[3] + ", Per Piece Price: 5taka" + "\n"
                + med[4] + ", Quantity: " + quan[4] + ", Per Piece Price: 7taka" + "\n"
                + "\n"
                + "Anti-Biotic List Given Bellow: " + "\n"
                + antiB[0] + ", Quantity: " + quanAnti[0] + ", Per Piece Price: 50taka" + "\n"
                + antiB[1] + ", Quantity: " + quanAnti[1] + ", Per Piece Price: 40taka" + "\n"
                + antiB[2] + ", Quantity: " + quanAnti[2] + ", Per Piece Price: 30taka" + "\n"
                + antiB[3] + ", Quantity: " + quanAnti[3] + ", Per Piece Price: 20taka" + "\n"
                + antiB[4] + ", Quantity: " + quanAnti[4] + ", Per Piece Price: 100taka" + "\n"
                ;
    }
}
