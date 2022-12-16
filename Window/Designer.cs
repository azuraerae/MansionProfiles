using System.ComponentModel;

namespace window {
    partial class Window {
        private IContainer components = null;
        private int[] size = new int[2];

        protected override void Dispose(bool disposing) {
            if(disposing && components != null){
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        private void InitializeComponent() {
            this.components = new Container();
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(size[0], size[1]);
            this.Text = "Mansion Profiles";
        }

        public void setSize(int x, int y) {
            this.size[0] = x;
            this.size[1] = y;

            this.updateWindow();
        }

        private void updateWindow(){
            this.Update();
        }   
    }
}