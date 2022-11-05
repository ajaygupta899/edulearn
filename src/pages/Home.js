import React from 'react';
class Home extends React.Component(){
    render(){
        return(
<>
        <div>
             <div class="main">
        <div class="navbar" style="display:inline-flex">
            <div class="logo-image">
                <img src="assets/images/cutm logo.png" class="img-fluid"/>    
          </div>
            <div class="iconf" style="float:left">
                <div id="main">
                   <p aling="left"> <button class="openbtn" onclick="openNav()">☰ Menu</button> </p>   
                  </div>    
            </div>
        </div> 
        <div id="mySidebar" class="sidebar">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
            <a href="#">About</a>
            <a href="#">Services</a>
            <a href="#">Contact</a>
            <a href="#">Developer</a>
          </div>
          
        
        <div class="content">
            
            <h1>Welcome To <br/><span>EduLearn</span> !</h1>
            <p class="par">
                Teach in a more Interactive Enviroment.
            </p>

                <button class="cn"><a href="#">JOIN US</a></button>

                <div class="form">
                    <h2>Login Here</h2>
                    <input type="email" name="email" placeholder="Enter Username"/>
                    <input type="password" name="" placeholder="Enter Password "/>
                    <button class="btnn"><a href="#">Login</a></button>

                    <p class="link">Don't have an account<br/>
                    <a href="#">Sign up </a> here</p>
                    <p class="liw">Log in with</p>
                    <div class="icons">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#"><ion-icon name="logo-facebook"></ion-icon></a>
                        <a href="#"><ion-icon name="logo-instagram"></ion-icon></a>
                        <a href="#"><ion-icon name="logo-google"></ion-icon></a>
                    </div>

                </div>
                    </div>
                </div>
   <section class="about"/>
                    <div class="container">
                        <img src="assets/images/teaching.jpg" alt="image to aling"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <div class="about-text">
                            <h1>About Us</h1>
                            <br/>
                
                            <p>EduLearn is an educational technology company offering a communication, collaboration, and coaching platform for many schools and teachers.
                                 <br>The EduLearn network enables teachers to share content, distribute quizzes, assignments, and manage communication with students, colleagues, and parents.
                                  <br>EduLearn is very teacher-centric in their design and philosophy: students and parents can only join EduLearn if invited to do so by a teacher.”
                                 
                             </p>
                        <div/>
                        </p>
                    </div>
               <section/>
        </div>
    </div>
    
    <div class="animation">
        <div id="carouselExampleControls" class="carousel slide" data-mdb-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="S3.jpg" class="d-block w-100" alt="Wild Landscape" />
                </div>
                <div class="carousel-item">
                    <img src="S1.jpg" class="d-block w-100" alt="Camera" />
                </div>
                <div class="carousel-item">
                    <img src="S2.jpg" class="d-block w-100" alt="Exotic Fruits" />
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-mdb-target="#carouselExampleControls" data-mdb-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-mdb-target="#carouselExampleControls" data-mdb-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
    <div class="service">
		<div class="title">
			<h2>Our Services</h2>
		</div>

		<div class="box">
			<div class="card">
				<i class="fas fa-users"></i>
				<h5>Join as a Student</h5>
				<div class="pra">
					<p>Here Student can access their work assigned by their teacher .</p>
					<p style="text-align: center;">
						<a class="button" href="#">Read More</a>
					</p>
				</div>
			</div>

			<div class="card">
				<i class="far fa-user"></i>
				<h5>Join as a Teacher</h5>
				<div class="pra">
					<p>This Helps a teacher to assign work to his/her students and also keep an eye on their activity.</p>

					<p style="text-align: center;">
						<a class="button" href="#">Read More</a>
					</p>
				</div>
			</div>

			<div class="card">
				<i class="far fa-id-card"></i>
				<h5>Join as a Parent</h5>
				<div class="pra">
					<p>As a parent you can see the activity log of you child.</p>
					<p style="text-align: center;">
						<a class="button" href="#">Read More</a>
					</p>
				</div>
			</div>
		</div>
	</div>
    <footer>
		<p>EduLearn by Centurion University</p>
		<p>A Enviroment where teaching is made easy in a form of social media tool student love to learn and interact with their teacher.<br>
        Find us </p>
        <div class="siteFooterBar">
            <center>
            <div class="content">
                <img src="/cutm logo.png" width="100px" height="100px" />
            </div>
        </center>
        </div>
		<div class="social">
			<a href="#"><i class="fab fa-facebook-f"></i></a>
			<a href="#"><i class="fab fa-instagram"></i></a>
			<a href="#"><i class="fab fa-twitter"></i></a>
            <br/>
            
        <br/>
		</div>
        <br/>
        <br/>&nbsp;
		<p class="end">© CopyRight Reserve By EduLearn</p>
	

   
    <script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>
        
        </footer>
      </>
        );
    }
}

export default Home;