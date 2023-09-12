/**
 * type of the class stage
 * @author euric
 */
class Desenvolvimento extends Tarefa{
    
    private double esforcoReal;
        
    public Desenvolvimento() {
    }
    
    /**
     * receives the input value of the real amount of effort spent on a stage
     * @param esforcoReal 
     */
    @Override
    public void setEsforcoReal(double esforcoReal) {
        this.esforcoReal = esforcoReal;
    }
    
    /**
     * returns the value of real amount of effort spent on a stage
     * @return 
     */
    @Override
    public double getEsforcoReal() {
        return esforcoReal;
    }
    
    /**
     * returns the amount of hours of expected effort to be made on this stage, per day
     * @return 
     */
    @Override
    public double getTaxaEsforco() {
        return 24;               
    }
    
    /**
     * print info about this type of stage
     * @return 
     */
    @Override
    public String toString() {
        return "\n---Tarefa de Desenvolvimento---" + super.toString();
    }
}