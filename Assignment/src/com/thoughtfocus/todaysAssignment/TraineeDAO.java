package com.thoughtfocus.todaysAssignment;

public class TraineeDAO {
	TraineeDetails[] details = new TraineeDetails[12];
	int index = 0;

	public void printAll() {

		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				System.out.println(details[index]);
			}

		}
		System.out.println("--------------------");

	}

	public void save(TraineeDetails details) {
		if (details != null) {
			this.details[index] = details;
			index++;
		}

	}

	public String deletebyName(String name) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (name.equals(details[index].getName())) {
					details[index] = null;
					return "Trainee details deleted " + name;
				}

			}

		}
		return "not deleted";

		

	}

	public String deletebyId(int id) {

		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (id == (details[index].getId())) {
					details[index] = null;
					return "Trainee details deleted " + id;

				}

			}

		}

		return "not deleted";

	}
	
	public String deletebyNum(long number) {
		for (int index = 0; index < details.length; index++) {
			if (details[index] != null) {
				if (number == (details[index].getNumber())) {
					details[index] = null;
					return "Trainee details deleted " + number;

				}

			}

		}

		return "not deleted";

	}
	
	
	public String updateById(int id, TraineeDetails detail) {
		for (int index = 0; index < details.length; index++) {
			if(details[index] != null && id==(details[index]).getId()) {
				details[index]=detail;
				return "Updated successfully";
				
			}
		}
		return "Failed to update";
	}
		
}


