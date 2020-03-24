package aula03_ex_1_2ADSM;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Pizzaiolo {
	
	public static Pizzaiolo pizzaiolo(String data)
	  {
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

	    Calendar calendar = Calendar.getInstance();
	    try
	    {
	      calendar.setTime(simpleDateFormat.parse(data));
	    }
	    catch(ParseException exception)
	    {

	    }
	  
	    if(calendar.get(Calendar.DAY_OF_WEEK) == 2 || calendar.get(Calendar.DAY_OF_WEEK) == 4 || calendar.get(Calendar.DAY_OF_WEEK) == 6)
	    {
	    	return new PizzaioloCalabresa();
	    }
	    if(calendar.get(Calendar.DAY_OF_WEEK) == 3 || calendar.get(Calendar.DAY_OF_WEEK) == 5 || calendar.get(Calendar.DAY_OF_WEEK) == 7)
	    {
	    	return new PizzaioloPresunto();
	    }
	    else
	    {
	    	return new PizzariaFechada();
	    }
	  }

		
	  @Override
	public String toString() {
		return "Pizzaria fechada aos domingos";
	}


	public abstract Calzone calzone();

	public abstract Pizza pizza();
}	
