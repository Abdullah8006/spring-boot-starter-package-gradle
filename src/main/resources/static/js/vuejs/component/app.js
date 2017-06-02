/**
 * 
 */
var app = new Vue({
	el : '#app',
	data : {
		id : 21,
		message : 'Hello Vue.js!',
		title : 'This is a title',
		names : []
	},
	methods:{
	    getUserNames: function() {
	    	for(i= 0; i < 5; i++){
	    		this.names.push("name" + i);
	    	}
	    },
	    alertMessage: function(){
	    	alert("Alert popping upp!!");
	    }
	},
	beforeMount(){
	   this.getUserNames();
	},
	computed :{
		swirlMessage : function() {
			return this.message.split('').reverse().join('');
		}
	}
})