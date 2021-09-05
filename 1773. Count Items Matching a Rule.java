public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1, count =0;
		//Using switch case identify which against index in the List, ruleValue has to be matched 
        switch(ruleKey){
            case "type" : index = 0;
            break;
            case "color" : index = 1;
            break;
            case "name" : index = 2;
            break;
        }
        if(index != -1) {
            for (List<String> item : items) {
			//Comparing the value at index i with ruleValue & incrementing count
                if (item.get(index).equals(ruleValue))
                    count += 1;
            }
        }
        return count;
    }
