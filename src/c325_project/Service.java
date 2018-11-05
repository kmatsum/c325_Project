package c325_project;

public class Service {
    //GETS AND SETS ============================================================
    private boolean recurring;
    private String company;
    
    public void setrecurring(boolean rc)
    {
        recurring = rc;
    }
    public boolean getrecurring()
    {
        return recurring;
    }
    
    public void setcompany(String co)
    {
        company = co;
    }
    
    public String getcompany()
    {
        return company;
    }
}
