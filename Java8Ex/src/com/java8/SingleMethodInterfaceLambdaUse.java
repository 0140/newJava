package com.java8;

public class SingleMethodInterfaceLambdaUse {

	public static void main(String[] args) {
		SingleMethodInterfaceLambdaUse
				.addStateListener(
						(oldState, newState) ->
						System.out.println(oldState + " " +newState)
						
							);
		
		
		SingleMethodInterfaceLambdaUse
		.addStateListener(
				(oldState, newState) -> {
					
					System.out.println(oldState + "---" +newState);
					System.out.println("Lamda Exp Done");
				}
				
				
					);

	}
	
	public static void addStateListener(SingleMethodInterface listnerObj ) {
        System.out.println("OK");
        listnerObj.onStateChange("New", "Old");
    }

}
