package domain;

public class Occurrence {
	
		String prefix;  //seedf之前出现的语料(最接近的一个词)
		String seedf;	//seedf   
		String middle;	//seedf和seedl之间出现的语料(中间所有的词)
		String seedl;	//seedl
		String suffix;	//seedl之后出现的语料(最接近的一个词)
		boolean order;	//是否在这个句子中找到种子
		int num;		//标记这个句子中有几个种子
		String symbol;  //标记这个种子属于什么类型
		
		public Occurrence(){}
		public Occurrence(String prefix,String seedf,String middle,String seedl,String suffix,String symbol,boolean order,int num){
			this.prefix = prefix;
			this.seedf = seedf;
			this.middle = middle;
			this.seedl = seedl;
			this.suffix = suffix;
			this.symbol = symbol;
			this.order = order;
			this.num = num;
		}
		
		public String getPrefix() {
			return prefix;
		}
		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}
		public String getSeedf() {
			return seedf;
		}
		public void setSeedf(String seedf) {
			this.seedf = seedf;
		}
		public String getMiddle() {
			return middle;
		}
		public void setMiddle(String middle) {
			this.middle = middle;
		}
		public String getSeedl() {
			return seedl;
		}
		public void setSeedl(String seedl) {
			this.seedl = seedl;
		}
		public String getSuffix() {
			return suffix;
		}
		public void setSuffix(String suffix) {
			this.suffix = suffix;
		}
		public boolean isOrder() {
			return order;
		}
		public void setOrder(boolean order) {
			this.order = order;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		
		public String toString(){
			return "(["+prefix+"],["+seedf+"],["+middle+"],["+seedl+"],["+suffix+"],["+symbol+"],"+order+","+num+")";
		}
		
}
