#Napisz kod kopiujący 1000 losowo wybranych obrazków do następującej struktury katalogów:
#
#./data/attractive/male - 250 obrazków zawierających mężczyzn ocenionych jako atrakcyjni
#./data/attractive/female - 250 obrazków zawierających kobiety ocenione jako atrakcyjne
#./data/notattractive/male - 250 obrazków zawierających mężczyzn ocenionych jako nieatrakcyjni
#./data/notattractive/female - 250 obrazków zawierających kobiety ocenione jako nieatrakcyjne
#Ten kod nie będzie testowany automatycznie.

#Uwaga: Aby otrzymać maksymalną liczbę punktów za to zadanie, twój kod powinien sprawdzać czy odpowiednie katalogi istnieją i jeśli ich nie ma to tworzyć je automatycznie.

import pandas as pd
import numpy as np
import os
import shutil
import random

def create_destination_folder_if_not_exist(destination_path):
    if(not os.path.exists(destination_path)):
        os.makedirs(destination_path, exist_ok=True)
    

def copy_images_to_folder(image_list, images_path, destination_path):
    create_destination_folder_if_not_exist(destination_path)
    for image in image_list:
        image_src_path = '{}/{}'.format(images_path, image)
        image_dest_path = '{}/{}'.format(destination_path, image)
        shutil.copyfile(image_src_path, image_dest_path)  

def create_n_random_image_names_list(n, images_df):
    images_names = images_df.index.tolist()
    return np.random.choice(images_names, n, replace=False)
        
def copy_n_images_for_sex_and_attractiveness_values(number_of_images, isMale, isAttractive,data_file_path, images_path, destination_path):
    celebs_df = pd.read_csv(data_file_path)    
    celebs_df = celebs_df.set_index('image_id')
    
    celebs_df_copy = celebs_df.copy()
    sex_condition = celebs_df_copy['Male'] == (1 if isMale == True else -1)
    attractiveness_condition = celebs_df_copy['Attractive'] == (1 if isAttractive == True else -1)    
    images_df = celebs_df_copy[sex_condition & attractiveness_condition]
    
    image_names = create_n_random_image_names_list(number_of_images, images_df)
    copy_images_to_folder(image_names,images_path,destination_path)


copy_n_images_for_sex_and_attractiveness_values(250, True, True, 'list_attr_celeba.csv'
                       ,'C:/Studia/1SEMESTR/Python/img_align_celeba/img_align_celeba','./data/attractive/male')
copy_n_images_for_sex_and_attractiveness_values(250, False, True, 'list_attr_celeba.csv'
                      ,'C:/Studia/1SEMESTR/Python/img_align_celeba/img_align_celeba','./data/attractive/female')
copy_n_images_for_sex_and_attractiveness_values(250, True, False, 'list_attr_celeba.csv'
                       ,'C:/Studia/1SEMESTR/Python/img_align_celeba/img_align_celeba','./data/noattractive/male')
copy_n_images_for_sex_and_attractiveness_values(250, False, False, 'list_attr_celeba.csv'
                       ,'C:/Studia/1SEMESTR/Python/img_align_celeba/img_align_celeba','./data/noattractive/female')
					   
#--------------------------------------------------------------------------------

import pandas as pd
import numpy as np
import os
import shutil
import random

def copy_images(n, cond1,cond2, file1, path1,path2):
    df = pd.read_csv(file1)    
    df = df.set_index('image_id')
    
    df_copy = df.copy()
    condition1 = df_copy['Male'] == (1 if cond1 == True else -1)
    condition2 = df_copy['Attractive'] == (1 if cond2 == True else -1)    
    df2 = df_copy[condition1 & condition2]
    names = df2.index.tolist()
    items = np.random.choice(names, n, replace=False)
    
    if(not os.path.exists(path2)):
        os.makedirs(path2, exist_ok=True)

    for item in items:
        src = '{}/{}'.format(path1, item)
        dst = '{}/{}'.format(path2, item)
        shutil.copyfile(src, dst)  
        
copy_images(250, True, True, 'list_attr_celeba.csv'
                       ,'C:/Studia/1SEMESTR/Python/img_align_celeba/img_align_celeba','./data/test/male')
