package removeunwanteddata;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpecialCharacter {


	public static void main(String[] args) {
		CommonPeople xp=new CommonPeople();
		List<Account> list=new ArrayList<Account>();
		List<Account> newList=new ArrayList<Account>();
		Account a =new Account();
		Account b =new Account();
		a.setAccountNUmber("%^$1234*&");
		a.setFirstName("Venu_1");
		a.setLastName("Venu)(*&^%");
		b.setAccountNUmber("%^$1234*&");
		b.setFirstName("Venu1");
		b.setLastName("Venu)(*&^%");
		list.add(a);
		list.add(b);
		xp.setAccounts(list);
		xp.getAccounts().forEach(account->{
			account.setAccountNUmber(account.getAccountNUmber().replaceAll("[^0-9a-zA-Z]",""));
			account.setFirstName(account.getFirstName().replaceAll("[^0-9a-zA-Z]",""));
			account.setLastName(account.getLastName().replaceAll("[^0-9a-zA-Z]",""));
			newList.add(account);
		});
		System.out.println(newList);
	}
}
