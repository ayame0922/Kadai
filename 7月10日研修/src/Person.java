
class Person {
	//名前と年齢のフィールド変数を定義
	private String name;
	private int age;
	//setterで「setName」と「setAge」のメソッドを作成
	public void setName( String nm ) {
	name = nm;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//自己紹介のメソッドを作成
	public void showProfile() {
	System.out.println( "名前は、" + name + "です。" );
	System.out.println( "年齢は、" + age + "です。" );
	}
}
