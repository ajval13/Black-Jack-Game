
public class Cards
	{
	private String suit;
	private String face;
	private int value;
	public Cards (String s, String r, int v)
	   {
	   suit = s;
	   face = r;
	   value = v;
	   }
	public String getSuits()
		{
			return suit;
		}
	public void setSuits(String suits)
		{
			this.suit = suits;
		}
	public String getRank()
		{
			return face;
		}
	public void setFace(String face)
		{
			this.face = face;
		}
	public int getValue()
		{
			return value;
		}
	public void setValue(int value)
		{
			this.value = value;
		}
	
	}
