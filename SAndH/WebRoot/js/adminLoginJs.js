window.onload=function(){
		var menu=document.getElementById('menu'),
			ps=menu.getElementsByTagName('p'),
			uls=menu.getElementsByTagName('ul');
			for(var i in ps){
				ps[i].id=i;
				ps[i].onclick=function(){
					var u=uls[this.id];
					if(u.style.display=='block'){
						u.style.display='none';
					}else{
						u.style.display='block';
					}	
				}
			}
	}
