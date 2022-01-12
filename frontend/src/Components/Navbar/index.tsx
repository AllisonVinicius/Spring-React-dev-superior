import { ReactComponent as GitHubIcon } from '../../assets/img/git.svg';
import './styles.css';


function Navbar(){
    return ( 
 <header>
        <nav className='container'>
          <div className='dsmovie-nav-content'>
            <h1>DsMovie</h1>
                 <a href="https://github.com/AllisonVinicius"> 
                 </a>
             <div className='dsmovie-contact-container'>
               <GitHubIcon />
               <p className='dsmovie-contact-link'>/AllisonVinicius</p>
             </div>
          </div>
        </nav>
      </header>)
}

export default Navbar;