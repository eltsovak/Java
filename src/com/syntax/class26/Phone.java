package com.syntax.class26;

	public abstract class Phone {
		
		void makeCall() {
			System.out.println("Phone makes call");
		}
		
		void sendText() {
			System.out.println("Phone can send text");
		}
		
		public abstract void navigate();
		
		public abstract void playMusic();
		
		public abstract void takePictures();

	}
	class Samsung extends Phone{
		
		public void playMusic() {
			System.out.println("Samsung plays music from google store");
		}
		
		public void navigate() {
			System.out.println("Samsung has installed gpa");
		}
		
		public void takePictures() {
			System.out.println("Samsung can take pictures");
		}
	}
	class IPhone extends Phone{
		
		public void navigate() {
			System.out.println("iPhone navigates gps from apple store");
		}
		
		public void playMusic() {
			System.out.println("iPhone plays music in apple store");
		}
		
		public void takePictures() {
			System.out.println("iPhone can take pictures");
		}
		
	}

