package kidszaniakl;

    class MyKid extends Kids {
	
	
	private final double fine = 20.00;
	private double deposit;

	MyKid(String StudentName, String ParentName, String ParentID, double deposits) 
	{
		super(StudentName, ParentName, ParentID);
		deposit = deposits;
	}
	
	public double DepositDeduct()
	{
		deposit = deposit - fine;
		return deposit; 
	}
	
    public String toString()
    {
		return "Student's Name: " +StudentName +"\n" 
               + "Parent's Name: " +ParentName +"\n" 
			   + "Parent's ID: " +ParentID + "\n" 
               + "Deposits: " +deposit + "\n";
    }
}

    